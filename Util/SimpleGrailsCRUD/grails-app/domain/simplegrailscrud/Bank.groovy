package simplegrailscrud

class Bank {

    String bankCode
    String bankName
    String location

    String toString(){
        return "${ bankCode - bankName }"
    }

    static mapping = {
        autoTimestamp( true )
        sort 'bankCode'
        order 'asc'
    }

    static constraints = {
        bankCode( nullable: false, unique: true )
        bankName( nullable: false )
        location( maxSize: 2000 )
    }
}
