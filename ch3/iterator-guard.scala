val q = "Faith,Hope,,Clarity"
for {
  t <- q.split(",")
  if t != null
  // if t.size > 0
}
{ println(s"${t}: ${t.size}") }
