var gulp = require('gulp');
var browserSync = require('browser-sync').create();

gulp.task('default', ['serve']);

gulp.task('serve', function() {

    browserSync.init({
        proxy: "localhost:8080"
    });

    gulp.watch("*.html").on('change', browserSync.reload);
});
