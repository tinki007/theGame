var gulp = require('gulp');
var browserSync = require('browser-sync').create();

gulp.task('default', ['serve']);

gulp.task('serve', function() {

    browserSync.init({
        proxy: 'localhost:8080',
        serveStatic: ['./app', './node_modules']
    });

    gulp.watch('app/**/*.html').on('change', browserSync.reload);
    gulp.watch('app/scripts/**/*.js').on('change', browserSync.reload);
    gulp.watch('app/css/**/*.css').on('change', browserSync.reload);
});
