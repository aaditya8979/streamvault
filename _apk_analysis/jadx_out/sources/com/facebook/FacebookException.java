package com.facebook;

import com.facebook.FacebookException;
import com.facebook.internal.FeatureManager;
import d3.e;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.Arrays;
import java.util.Random;
import k2.t;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: FacebookException.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0016\u0018\u0000 \u00122\u00060\u0001j\u0002`\u0002:\u0001\u0013B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0006B\u0013\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\bB+\b\u0016\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0016\u0010\f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000b0\n\"\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0005\u0010\rB\u001d\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0005\u0010\u0010B\u0013\b\u0016\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0005\u0010\u0011J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0014"}, d2 = {"Lcom/facebook/FacebookException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", "toString", "<init>", "()V", "message", "(Ljava/lang/String;)V", "format", "", "", "args", "(Ljava/lang/String;[Ljava/lang/Object;)V", "", "throwable", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "(Ljava/lang/Throwable;)V", VastTagName.COMPANION, "a", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public class FacebookException extends RuntimeException {
    public static final long serialVersionUID = 1;

    public FacebookException() {
    }

    public FacebookException(@Nullable final String str) {
        super(str);
        Random random = new Random();
        if (str == null || !t.F() || random.nextInt(100) <= 50) {
            return;
        }
        FeatureManager featureManager = FeatureManager.f15284a;
        FeatureManager.a(FeatureManager.Feature.ErrorReport, new FeatureManager.a() { // from class: k2.j
            @Override // com.facebook.internal.FeatureManager.a
            public final void a(boolean z10) {
                FacebookException.b(str, z10);
            }
        });
    }

    public FacebookException(@Nullable String str, @Nullable Throwable th2) {
        super(str, th2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FacebookException(@Nullable String str, @NotNull Object... objArr) {
        String str2;
        p.k(objArr, "args");
        if (str == null) {
            str2 = null;
        } else {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            str2 = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            p.j(str2, "java.lang.String.format(this, *args)");
        }
        this(str2);
    }

    public FacebookException(@Nullable Throwable th2) {
        super(th2);
    }

    public static final void b(String str, boolean z10) {
        if (z10) {
            try {
                e.g(str);
            } catch (Exception unused) {
            }
        }
    }

    @Override // java.lang.Throwable
    @NotNull
    public String toString() {
        String message = getMessage();
        return message == null ? "" : message;
    }
}
