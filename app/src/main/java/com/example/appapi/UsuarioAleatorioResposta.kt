package com.example.appapi

data class UsuarioAleatorioResposta(
    val results: List<User>
)

data class User(
    val name: UserName,
    val email: String,
    val picture: UserPicture
)

data class UserName(
    val first: String,
    val last: String
)

data class UserPicture(
    val large: String
)