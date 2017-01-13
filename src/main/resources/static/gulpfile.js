var gulp = require('gulp');
var browserSync = require('browser-sync').create();

gulp.task('default', ['serve']);

gulp.task('serve', ['css'], function() {

    browserSync.init({
        proxy: 'localhost:8080'
    });

    gulp.watch('app/*.html').on('change', browserSync.reload);
    gulp.watch('app/css/*.css', ['css']);

});

gulp.task('css', function(){
    return browserSync.reload();

    return gulp.src('./app/css/*.css')
        .pipe(gulp.dest('./folderWynikowy'))
        .pipe(browserSync.reload());
});


