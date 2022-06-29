job('mssql-generate-and-apply-HERE-staging-script') {
    steps {
        batchFile('@echo off\n' +
                'echo Started HERE staging script generation, and apply\n' +
                'D:\n' +
                'cd D:\\Airflow\\HERE_Automate\n' +
                'produce-HERE-load-script.bat\n' +
                'echo Finished HERE staging script generation, and apply')

    }
    description('Create script that generate HERE db')
}
