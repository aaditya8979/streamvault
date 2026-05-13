package yads;

import android.content.Context;
import android.graphics.Typeface;
import androidx.core.content.res.ResourcesCompat;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class ui0 extends Lambda implements sn.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vi0 f95668b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ui0(vi0 vi0Var) {
        super(0);
        this.f95668b = vi0Var;
    }

    @Override // sn.a
    public final Object invoke() {
        Typeface font;
        Typeface font2;
        Typeface font3;
        Typeface font4;
        Context context = this.f95668b.f96105a;
        Object obj = dw2.f89000j;
        nt2 nt2VarA = cw2.a().a(context);
        String str = nt2VarA != null ? nt2VarA.V : null;
        if (str == null) {
            return null;
        }
        try {
            zw0 zw0VarValueOf = zw0.valueOf(str);
            if (ax0.f87831a[zw0VarValueOf.ordinal()] != 1) {
                throw new NoWhenBranchMatchedException();
            }
            try {
                font = ResourcesCompat.getFont(context, zw0VarValueOf.f97812b);
            } catch (Throwable unused) {
                font = null;
            }
            try {
                font2 = ResourcesCompat.getFont(context, zw0VarValueOf.f97813c);
            } catch (Throwable unused2) {
                font2 = null;
            }
            try {
                font3 = ResourcesCompat.getFont(context, zw0VarValueOf.f97814d);
            } catch (Throwable unused3) {
                font3 = null;
            }
            try {
                font4 = ResourcesCompat.getFont(context, zw0VarValueOf.f97815e);
            } catch (Throwable unused4) {
                font4 = null;
            }
            return new yw0(font, font2, font3, font4);
        } catch (Throwable unused5) {
            return null;
        }
    }
}
