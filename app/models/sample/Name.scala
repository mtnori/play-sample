package models.sample

// PRODUCT ADT
// sealedを付与して拡張不可とする
sealed case class Name(firstName: String, lastName: String)

// 構成するタイプの積を計算することにより、
// そのアリティ（可能性のある値の数）を計算できるため、
// これは製品タイプと呼ばれる
