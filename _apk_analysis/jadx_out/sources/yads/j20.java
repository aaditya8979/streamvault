package yads;

import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class j20 implements yj3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b20 f91077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wj3 f91078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mh3 f91079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final db1 f91080d = new db1(new c20());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f91081e;

    public j20(b20 b20Var, wj3 wj3Var, mh3 mh3Var) {
        this.f91077a = b20Var;
        this.f91078b = wj3Var;
        this.f91079c = mh3Var;
    }

    @Override // yads.yj3
    public final void a() {
        this.f91078b.a(this.f91077a, CampaignEx.JSON_NATIVE_VIDEO_UNMUTE);
    }

    @Override // yads.yj3
    public final void a(float f10) {
    }

    @Override // yads.yj3
    public final void a(float f10, long j10) {
        if (this.f91081e) {
            return;
        }
        this.f91081e = true;
        this.f91078b.a(this.f91077a, "start");
    }

    @Override // yads.yj3
    public final void a(View view, List list) {
    }

    @Override // yads.yj3
    public final void a(jf3 jf3Var) {
    }

    @Override // yads.yj3
    public final void a(xj3 xj3Var) {
        String str;
        int iOrdinal = xj3Var.ordinal();
        if (iOrdinal == 0) {
            str = "firstQuartile";
        } else if (iOrdinal == 1) {
            str = CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "thirdQuartile";
        }
        this.f91078b.a(this.f91077a, str);
    }

    @Override // yads.yj3
    public final void b() {
        this.f91078b.a(this.f91077a, "complete");
    }

    @Override // yads.yj3
    public final void c() {
        this.f91078b.a(this.f91077a, CampaignEx.JSON_NATIVE_VIDEO_RESUME);
    }

    @Override // yads.yj3
    public final void d() {
        this.f91078b.a(this.f91077a, CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
    }

    @Override // yads.yj3
    public final void f() {
    }

    @Override // yads.yj3
    public final void g() {
    }

    @Override // yads.yj3
    public final void h() {
        this.f91078b.a(this.f91077a, "creativeView");
    }

    @Override // yads.yj3
    public final void i() {
        this.f91078b.a(new g20(this.f91077a), "creativeRenderingStart");
    }

    @Override // yads.yj3
    public final void j() {
    }

    @Override // yads.yj3
    public final void k() {
        this.f91081e = false;
    }

    @Override // yads.yj3
    public final void l() {
        this.f91078b.a(this.f91077a, CampaignEx.JSON_NATIVE_VIDEO_MUTE);
    }

    @Override // yads.yj3
    public final void m() {
        if (!this.f91081e) {
            this.f91081e = true;
            this.f91078b.a(this.f91077a, "start");
        }
        this.f91078b.a(this.f91077a, "clickTracking");
    }

    @Override // yads.yj3
    public final void n() {
    }
}
