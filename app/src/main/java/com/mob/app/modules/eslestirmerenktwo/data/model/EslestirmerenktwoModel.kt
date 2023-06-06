package com.mob.app.modules.eslestirmerenktwo.`data`.model

import com.mob.app.R
import com.mob.app.appcomponents.di.MyApp
import kotlin.String

data class EslestirmerenktwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var etMetinyazlacakValue: String? = null
,
  var txtmatchone: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_1)
  ,
  var txtmatchtwo: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_2)
  ,  var txtmatchthree: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_3)
  ,  var txtmatchfour: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_4)
  ,
  var txtmatchpink: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_pembe)
  ,var txtmatchyellow: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sari)
  ,var txtmatchorange: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_turuncu)
  ,var txtmatchgreen: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_ye_l)
  ,

  var txtHadieletirel: String? =
      MyApp.getInstance().resources.getString(R.string.msg_hadi_e_le_tirel)

)
