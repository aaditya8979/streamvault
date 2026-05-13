package com.yk.e.activity;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import com.ironsource.Y5;
import com.yk.e.util.Constant;

/* JADX INFO: renamed from: com.yk.e.activity.I丨L, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class IL implements Handler.Callback {
    public final /* synthetic */ RewardWebActivity IL1Iii;

    public IL(RewardWebActivity rewardWebActivity) {
        this.IL1Iii = rewardWebActivity;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        String stringExtra;
        Intent intent = (Intent) message.obj;
        if (intent != null && intent.hasExtra(Y5.c.f30723a) && (stringExtra = intent.getStringExtra(Y5.c.f30723a)) != null && stringExtra.equals(this.IL1Iii.ILL.clickUrl)) {
            if (intent.hasExtra("progress")) {
                if (Constant.fileLoadRunning(stringExtra)) {
                    int intExtra = intent.getIntExtra("progress", 0);
                    this.IL1Iii.f3332IL.setText(intExtra + "%");
                    if (intExtra == 100) {
                        RewardWebActivity rewardWebActivity = this.IL1Iii;
                        rewardWebActivity.f3332IL.setText(rewardWebActivity.getString("main_install"));
                    }
                }
            } else if (intent.hasExtra("downLoadFail")) {
                RewardWebActivity rewardWebActivity2 = this.IL1Iii;
                rewardWebActivity2.f3332IL.setText(rewardWebActivity2.getString("main_downLoad"));
            }
        }
        return false;
    }
}
