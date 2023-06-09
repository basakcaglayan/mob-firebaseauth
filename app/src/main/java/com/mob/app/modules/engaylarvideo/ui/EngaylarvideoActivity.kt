package com.mob.app.modules.engaylarvideo.ui

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.MediaController
import android.widget.VideoView
import androidx.activity.viewModels
import com.mob.app.R
import com.mob.app.appcomponents.base.BaseActivity
import com.mob.app.databinding.ActivityEngaylarvideoBinding
import com.mob.app.modules.engaylarozet.ui.EngaylarozetActivity
import com.mob.app.modules.engaylarvideo.`data`.viewmodel.EngaylarvideoVM
import kotlin.String
import kotlin.Unit

class EngaylarvideoActivity :
    BaseActivity<ActivityEngaylarvideoBinding>(R.layout.activity_engaylarvideo) {
  private val viewModel: EngaylarvideoVM by viewModels<EngaylarvideoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.engaylarvideoVM = viewModel



    val videoView = findViewById<VideoView>(R.id.viewengaylarvideo) // VideoView'ı layout dosyanızda tanımladığınız id ile değiştirin
    val videoUri = Uri.parse("android.resource://" + packageName + "/" + R.raw.engaylarvideo)
    videoView.setVideoURI(videoUri)
    videoView.start()
  }

  override fun setUpClicks(): Unit {
    binding.linearRowletsreinforce.setOnClickListener {
      val destIntent = EngaylarozetActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }
  companion object {
    const val TAG: String = "ENGAYLARVIDEO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, EngaylarvideoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
