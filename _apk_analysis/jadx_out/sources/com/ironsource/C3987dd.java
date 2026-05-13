package com.ironsource;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* JADX INFO: renamed from: com.ironsource.dd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3987dd extends AbstractC4244s3 {

    @NotNull
    public static final C3987dd P;

    /* JADX INFO: renamed from: com.ironsource.dd$a */
    public static final class a {
        public final void a() throws JSONException {
            new X9().b(ContextProvider.getInstance().getApplicationContext());
            C3987dd.P.a(new C5(D5.INIT_DEFERRED_DATA, new C3983d9().a()));
        }
    }

    static {
        C3987dd c3987dd = new C3987dd();
        P = c3987dd;
        c3987dd.H = K5.f29723b;
        c3987dd.G = 0;
        c3987dd.I = IronSourceConstants.PIXEL_EVENT_TYPE;
        c3987dd.e();
    }

    private C3987dd() {
    }

    @Override // com.ironsource.AbstractC4244s3
    public void a(@Nullable ArrayList<C5> arrayList) {
    }

    @Override // com.ironsource.AbstractC4244s3
    public int c(@Nullable C5 c52) {
        return 1;
    }

    @Override // com.ironsource.AbstractC4244s3
    public void d() {
    }

    @Override // com.ironsource.AbstractC4244s3
    public boolean d(@Nullable C5 c52) {
        return true;
    }

    @Override // com.ironsource.AbstractC4244s3
    @NotNull
    public String e(int i10) {
        return "";
    }

    @Override // com.ironsource.AbstractC4244s3
    public void f(@Nullable C5 c52) {
    }

    @Override // com.ironsource.AbstractC4244s3
    public boolean g(@Nullable C5 c52) {
        return false;
    }

    @Override // com.ironsource.AbstractC4244s3
    public boolean h(@Nullable C5 c52) {
        return false;
    }

    @Override // com.ironsource.AbstractC4244s3
    public boolean j(@Nullable C5 c52) {
        return false;
    }
}
