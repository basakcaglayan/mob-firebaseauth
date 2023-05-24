package com.mob.app.modules.engseasonsecim.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityEngseasonsecimBinding
import com.mob.app.modules.engseasonsecim.`data`.model.EngseasonsecimRowModel
import com.mob.app.modules.engseasonsecim.`data`.viewmodel.EngseasonsecimVM
import com.mob.app.modules.fall.ui.FallActivity
import com.mob.app.modules.learning.ui.LearningActivity
import com.mob.app.modules.spring.ui.SpringActivity
import com.mob.app.modules.summer.ui.SummerActivity
import com.mob.app.modules.winter.ui.WinterActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class EngseasonsecimActivity :
    BaseActivity<ActivityEngseasonsecimBinding>(R.layout.activity_engseasonsecim) {
  private val viewModel: EngseasonsecimVM by viewModels<EngseasonsecimVM>()

  private val REQUEST_CODE_LEARNING_ACTIVITY: Int = 773


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val engseasonsecimAdapter =
    EngseasonsecimAdapter(viewModel.engseasonsecimList.value?:mutableListOf())
    binding.recyclerEngseasonsecim.adapter = engseasonsecimAdapter
    engseasonsecimAdapter.setOnItemClickListener(
    object : EngseasonsecimAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : EngseasonsecimRowModel) {
        onClickRecyclerEngseasonsecim(view, position, item)
      }
    }
    )
    viewModel.engseasonsecimList.observe(this) {
      engseasonsecimAdapter.updateData(it)
    }
    binding.engseasonsecimVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameEngSeasonSecim.setOnClickListener {
      val destIntent = LearningActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_LEARNING_ACTIVITY)
    }
  }

  fun onClickRecyclerEngseasonsecim(
    view: View,
    position: Int,
    item: EngseasonsecimRowModel
  ): Unit {
    when(view.id) {
      R.id.image48865861 -> {
        onClickRecyclerEngseasonsecimImage48865861(view, position, item)
      }
    }
  }

  fun onClickRecyclerEngseasonsecimImage48865861(
    view: View,
    position: Int,
    item: EngseasonsecimRowModel
  ): Unit {
    /** TODO As per your logic, Add constant type for item click.*/
    when(0) {
      0 -> {
        val destIntent = WinterActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      1 -> {
        val destIntent = SummerActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      2 -> {
        val destIntent = SpringActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      3 -> {
        val destIntent = FallActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  companion object {
    const val TAG: String = "ENGSEASONSECIM_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EngseasonsecimActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}