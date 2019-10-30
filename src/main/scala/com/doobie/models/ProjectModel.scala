package com.doobie.models

import java.util.Date

case class Project(id: Int, name: String, start: Option[Date], end: Option[Date])