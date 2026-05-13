package s3;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mbridge.msdk.newinterstitial.out.MBBidNewInterstitialHandler;
import com.mbridge.msdk.newinterstitial.out.MBNewInterstitialHandler;
import com.mbridge.msdk.newinterstitial.out.NewInterstitialWithCodeListener;
import com.mbridge.msdk.out.MBBannerView;
import com.mbridge.msdk.out.MBBidRewardVideoHandler;
import com.mbridge.msdk.out.MBRewardVideoHandler;
import com.mbridge.msdk.out.MBSplashHandler;
import com.mbridge.msdk.out.MBSplashLoadWithCodeListener;
import com.mbridge.msdk.out.MBSplashShowListener;
import com.mbridge.msdk.out.RewardVideoWithCodeListener;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import tn.p;

/* JADX INFO: compiled from: MintegralFactory.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e f79049a = new e();

    /* JADX INFO: compiled from: MintegralFactory.kt */
    public static final class a implements s3.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public MBBidNewInterstitialHandler f79050a;

        @Override // s3.b
        public void a(Context context, String str, String str2) {
            p.k(context, GAMConfig.KEY_CONTEXT);
            p.k(str, "placementId");
            p.k(str2, "adUnitId");
            this.f79050a = new MBBidNewInterstitialHandler(context, str, str2);
        }

        @Override // s3.b
        public void b(NewInterstitialWithCodeListener newInterstitialWithCodeListener) {
            p.k(newInterstitialWithCodeListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            MBBidNewInterstitialHandler mBBidNewInterstitialHandler = this.f79050a;
            if (mBBidNewInterstitialHandler != null) {
                mBBidNewInterstitialHandler.setInterstitialVideoListener(newInterstitialWithCodeListener);
            }
        }

        @Override // s3.b
        public void loadFromBid(String str) {
            p.k(str, "bidToken");
            MBBidNewInterstitialHandler mBBidNewInterstitialHandler = this.f79050a;
            if (mBBidNewInterstitialHandler != null) {
                mBBidNewInterstitialHandler.loadFromBid(str);
            }
        }

        @Override // s3.b
        public void playVideoMute(int i10) {
            MBBidNewInterstitialHandler mBBidNewInterstitialHandler = this.f79050a;
            if (mBBidNewInterstitialHandler != null) {
                mBBidNewInterstitialHandler.playVideoMute(i10);
            }
        }

        @Override // s3.b
        public void setExtraInfo(JSONObject jSONObject) {
            p.k(jSONObject, "jsonObject");
            MBBidNewInterstitialHandler mBBidNewInterstitialHandler = this.f79050a;
            if (mBBidNewInterstitialHandler != null) {
                mBBidNewInterstitialHandler.setExtraInfo(jSONObject);
            }
        }

        @Override // s3.b
        public void showFromBid() {
            MBBidNewInterstitialHandler mBBidNewInterstitialHandler = this.f79050a;
            if (mBBidNewInterstitialHandler != null) {
                mBBidNewInterstitialHandler.showFromBid();
            }
        }
    }

    /* JADX INFO: compiled from: MintegralFactory.kt */
    public static final class b implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public MBNewInterstitialHandler f79051a;

        @Override // s3.g
        public void a(Context context, String str, String str2) {
            p.k(context, GAMConfig.KEY_CONTEXT);
            p.k(str, "placementId");
            p.k(str2, "adUnitId");
            this.f79051a = new MBNewInterstitialHandler(context, str, str2);
        }

        @Override // s3.g
        public void b(NewInterstitialWithCodeListener newInterstitialWithCodeListener) {
            p.k(newInterstitialWithCodeListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            MBNewInterstitialHandler mBNewInterstitialHandler = this.f79051a;
            if (mBNewInterstitialHandler != null) {
                mBNewInterstitialHandler.setInterstitialVideoListener(newInterstitialWithCodeListener);
            }
        }

        @Override // s3.g
        public void load() {
            MBNewInterstitialHandler mBNewInterstitialHandler = this.f79051a;
            if (mBNewInterstitialHandler != null) {
                mBNewInterstitialHandler.load();
            }
        }

        @Override // s3.g
        public void playVideoMute(int i10) {
            MBNewInterstitialHandler mBNewInterstitialHandler = this.f79051a;
            if (mBNewInterstitialHandler != null) {
                mBNewInterstitialHandler.playVideoMute(i10);
            }
        }

        @Override // s3.g
        public void show() {
            MBNewInterstitialHandler mBNewInterstitialHandler = this.f79051a;
            if (mBNewInterstitialHandler != null) {
                mBNewInterstitialHandler.show();
            }
        }
    }

    /* JADX INFO: compiled from: MintegralFactory.kt */
    public static final class c implements s3.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public MBBidRewardVideoHandler f79052a;

        @Override // s3.c
        public void a(Context context, String str, String str2) {
            p.k(context, GAMConfig.KEY_CONTEXT);
            p.k(str, "placementId");
            p.k(str2, "adUnitId");
            this.f79052a = new MBBidRewardVideoHandler(context, str, str2);
        }

        @Override // s3.c
        public void b(RewardVideoWithCodeListener rewardVideoWithCodeListener) {
            p.k(rewardVideoWithCodeListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            MBBidRewardVideoHandler mBBidRewardVideoHandler = this.f79052a;
            if (mBBidRewardVideoHandler != null) {
                mBBidRewardVideoHandler.setRewardVideoListener(rewardVideoWithCodeListener);
            }
        }

        @Override // s3.c
        public void loadFromBid(String str) {
            p.k(str, "bidToken");
            MBBidRewardVideoHandler mBBidRewardVideoHandler = this.f79052a;
            if (mBBidRewardVideoHandler != null) {
                mBBidRewardVideoHandler.loadFromBid(str);
            }
        }

        @Override // s3.c
        public void playVideoMute(int i10) {
            MBBidRewardVideoHandler mBBidRewardVideoHandler = this.f79052a;
            if (mBBidRewardVideoHandler != null) {
                mBBidRewardVideoHandler.playVideoMute(i10);
            }
        }

        @Override // s3.c
        public void setExtraInfo(JSONObject jSONObject) {
            p.k(jSONObject, "jsonObject");
            MBBidRewardVideoHandler mBBidRewardVideoHandler = this.f79052a;
            if (mBBidRewardVideoHandler != null) {
                mBBidRewardVideoHandler.setExtraInfo(jSONObject);
            }
        }

        @Override // s3.c
        public void showFromBid() {
            MBBidRewardVideoHandler mBBidRewardVideoHandler = this.f79052a;
            if (mBBidRewardVideoHandler != null) {
                mBBidRewardVideoHandler.showFromBid();
            }
        }
    }

    /* JADX INFO: compiled from: MintegralFactory.kt */
    public static final class d implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public MBRewardVideoHandler f79053a;

        @Override // s3.h
        public void a(Context context, String str, String str2) {
            p.k(context, GAMConfig.KEY_CONTEXT);
            p.k(str, "placementId");
            p.k(str2, "adUnitId");
            this.f79053a = new MBRewardVideoHandler(context, str, str2);
        }

        @Override // s3.h
        public void b(RewardVideoWithCodeListener rewardVideoWithCodeListener) {
            p.k(rewardVideoWithCodeListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            MBRewardVideoHandler mBRewardVideoHandler = this.f79053a;
            if (mBRewardVideoHandler != null) {
                mBRewardVideoHandler.setRewardVideoListener(rewardVideoWithCodeListener);
            }
        }

        @Override // s3.h
        public void load() {
            MBRewardVideoHandler mBRewardVideoHandler = this.f79053a;
            if (mBRewardVideoHandler != null) {
                mBRewardVideoHandler.load();
            }
        }

        @Override // s3.h
        public void playVideoMute(int i10) {
            MBRewardVideoHandler mBRewardVideoHandler = this.f79053a;
            if (mBRewardVideoHandler != null) {
                mBRewardVideoHandler.playVideoMute(i10);
            }
        }

        @Override // s3.h
        public void show() {
            MBRewardVideoHandler mBRewardVideoHandler = this.f79053a;
            if (mBRewardVideoHandler != null) {
                mBRewardVideoHandler.show();
            }
        }
    }

    /* JADX INFO: renamed from: s3.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: MintegralFactory.kt */
    public static final class C0950e implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public MBSplashHandler f79054a;

        @Override // s3.j
        public void a() {
            MBSplashHandler mBSplashHandler = this.f79054a;
            if (mBSplashHandler != null) {
                mBSplashHandler.preLoad();
            }
        }

        @Override // s3.j
        public void b(String str, String str2) {
            p.k(str, "placementId");
            p.k(str2, "adUnitId");
            this.f79054a = new MBSplashHandler(str, str2, true, 5);
        }

        @Override // s3.j
        public void c(MBSplashLoadWithCodeListener mBSplashLoadWithCodeListener) {
            p.k(mBSplashLoadWithCodeListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            MBSplashHandler mBSplashHandler = this.f79054a;
            if (mBSplashHandler != null) {
                mBSplashHandler.setSplashLoadListener(mBSplashLoadWithCodeListener);
            }
        }

        @Override // s3.j
        public void d(ViewGroup viewGroup, String str) {
            p.k(viewGroup, "group");
            p.k(str, "bidToken");
            MBSplashHandler mBSplashHandler = this.f79054a;
            if (mBSplashHandler != null) {
                mBSplashHandler.show(viewGroup, str);
            }
        }

        @Override // s3.j
        public void e(String str) {
            p.k(str, "token");
            MBSplashHandler mBSplashHandler = this.f79054a;
            if (mBSplashHandler != null) {
                mBSplashHandler.preLoadByToken(str);
            }
        }

        @Override // s3.j
        public void f(MBSplashShowListener mBSplashShowListener) {
            p.k(mBSplashShowListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            MBSplashHandler mBSplashHandler = this.f79054a;
            if (mBSplashHandler != null) {
                mBSplashHandler.setSplashShowListener(mBSplashShowListener);
            }
        }

        @Override // s3.j
        public void g(ViewGroup viewGroup) {
            p.k(viewGroup, "group");
            MBSplashHandler mBSplashHandler = this.f79054a;
            if (mBSplashHandler != null) {
                mBSplashHandler.show(viewGroup);
            }
        }

        @Override // s3.j
        public void onDestroy() {
            MBSplashHandler mBSplashHandler = this.f79054a;
            if (mBSplashHandler != null) {
                mBSplashHandler.onDestroy();
            }
        }

        @Override // s3.j
        public void setExtraInfo(JSONObject jSONObject) {
            p.k(jSONObject, "jsonObject");
            MBSplashHandler mBSplashHandler = this.f79054a;
            if (mBSplashHandler != null) {
                mBSplashHandler.setExtraInfo(jSONObject);
            }
        }
    }

    @NotNull
    public static final s3.b a() {
        return new a();
    }

    @NotNull
    public static final g b() {
        return new b();
    }

    @NotNull
    public static final MBBannerView c(@NotNull Context context) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        return new MBBannerView(context);
    }

    @NotNull
    public static final s3.c d() {
        return new c();
    }

    @NotNull
    public static final h e() {
        return new d();
    }

    @NotNull
    public static final j f() {
        return new C0950e();
    }
}
