job('EirCode') {
    parameters {
        stringParam("DB_USER", "admin", "")
        nonStoredPasswordParam('EIRCODE_PASSWORD', '')
    }
    steps {
        shell("""cd /opt/loqate/Data/Source/Eircode/
                 dos2unix *
                 sh -x /opt/loqate/Data/Source/Eircode/dl.eircode.sh
             """)
    }
    description('Create script that generate HERE db')
}
