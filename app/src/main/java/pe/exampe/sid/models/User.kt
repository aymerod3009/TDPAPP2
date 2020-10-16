package pe.exampe.sid.models

data class User (
    var id:Int,
    var firstName:String,
    var lastName:String,
    var dni:String,
    var phone:String,
    var email:String,
    var password:String,
    var confirmPassword:String,
    var listCities:List<City>
)