package models.sample

// PRODUCT ADT
// sealedを付与して拡張不可とする
sealed case class Name(firstName: String, lastName: String)
