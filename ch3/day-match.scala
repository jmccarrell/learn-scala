val day = "su"
val kind = day match {
  case "mon" | "tue" | "wed" | "thu" | "fri" => {
    "weekday"
  }
  case "sat" | "sun" =>
    "weekend"
}
