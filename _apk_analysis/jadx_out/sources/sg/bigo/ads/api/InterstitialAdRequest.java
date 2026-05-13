package sg.bigo.ads.api;

import androidx.annotation.Nullable;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class InterstitialAdRequest extends b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f81783i;

    public static class Builder extends c<Builder, InterstitialAdRequest> {
        @Override // sg.bigo.ads.api.c
        public InterstitialAdRequest createAdRequest() {
            return new InterstitialAdRequest(this.mSlotId, this.mServerBidPayload);
        }
    }

    public InterstitialAdRequest(String str, String str2) {
        super(str, str2);
        this.f81783i = 3;
    }

    @Override // sg.bigo.ads.api.b
    public final boolean a(int i10) {
        if (i10 == 3) {
            this.f81783i = 3;
            return false;
        }
        if (i10 != 20) {
            return true;
        }
        this.f81783i = 20;
        return false;
    }

    @Override // sg.bigo.ads.api.b
    public final int c() {
        return this.f81783i;
    }

    @Override // sg.bigo.ads.api.b
    @Nullable
    public final Map<String, Object> d() {
        return null;
    }
}
