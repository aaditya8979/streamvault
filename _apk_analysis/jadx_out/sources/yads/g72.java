package yads;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import yads.g72;

/* JADX INFO: loaded from: classes6.dex */
public final class g72 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ai3 f89845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w52 f89846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f89847c;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g72(yads.ai3 r5, yads.w52 r6) {
        /*
            r4 = this;
            r4.<init>()
            r4.f89845a = r5
            r4.f89846b = r6
            java.lang.Double r5 = r5.a()
            if (r5 == 0) goto L27
            double r0 = r5.doubleValue()
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r0 = 1
            if (r6 != 0) goto L1a
            r6 = r0
            goto L1b
        L1a:
            r6 = 0
        L1b:
            r6 = r6 ^ r0
            if (r6 == 0) goto L1f
            goto L20
        L1f:
            r5 = 0
        L20:
            if (r5 == 0) goto L27
            double r5 = r5.doubleValue()
            goto L29
        L27:
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L29:
            r4.f89847c = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.g72.<init>(yads.ai3, yads.w52):void");
    }

    public /* synthetic */ g72(p52 p52Var, ai3 ai3Var) {
        this(ai3Var, new w52(p52Var));
    }

    public static final void a(g72 g72Var, CheckBox checkBox, View view) {
        double d10 = checkBox.isChecked() ^ true ? g72Var.f89847c : 0.0d;
        w52 w52Var = g72Var.f89846b;
        w52Var.getClass();
        w52Var.f96292a.setVolume((float) d10);
    }

    public final void a(gl1 gl1Var) {
        if (gl1Var != null) {
            final CheckBox muteControl = gl1Var.getMuteControl();
            if (muteControl != null) {
                muteControl.setOnClickListener(new View.OnClickListener() { // from class: bt.b2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        g72.a(this.f5948b, muteControl, view);
                    }
                });
                muteControl.setVisibility(this.f89845a.f87713b ? 0 : 8);
            }
            ProgressBar videoProgress = gl1Var.getVideoProgress();
            if (videoProgress != null) {
                videoProgress.setVisibility(this.f89845a.f87714c ? 8 : 0);
            }
            TextView countDownProgress = gl1Var.getCountDownProgress();
            if (countDownProgress != null) {
                countDownProgress.setText("");
                countDownProgress.setVisibility(0);
            }
        }
    }
}
