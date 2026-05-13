package com.facebook.internal;

import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.LoggingBehavior;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Logger.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 \u00032\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\b#\u0010$J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J)\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t\"\u00020\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u000f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0001J\b\u0010\u0011\u001a\u00020\u0010H\u0002R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u001a\u0010\u001b\u001a\u00060\u0018j\u0002`\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR*\u0010\"\u001a\u00020\u001c2\u0006\u0010\u000e\u001a\u00020\u001c8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006%"}, d2 = {"Lcom/facebook/internal/a0;", "", "Lbn/r;", "e", "", TypedValues.Custom.S_STRING, InneractiveMediationDefs.GENDER_FEMALE, "b", "format", "", "args", "c", "(Ljava/lang/String;[Ljava/lang/Object;)V", "key", "value", "d", "", "g", "Lcom/facebook/LoggingBehavior;", "a", "Lcom/facebook/LoggingBehavior;", "behavior", "Ljava/lang/String;", "tag", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "Ljava/lang/StringBuilder;", "contents", "", "I", "getPriority", "()I", "setPriority", "(I)V", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "<init>", "(Lcom/facebook/LoggingBehavior;Ljava/lang/String;)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class a0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final HashMap<String, String> f15302f = new HashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LoggingBehavior behavior;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String tag;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public StringBuilder contents;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public int priority;

    /* JADX INFO: renamed from: com.facebook.internal.a0$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Logger.kt */
    @Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0007J \u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0007J;\u0010\u0011\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u000f\"\u00020\u0001H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u0015\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0007J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0002R\u0014\u0010\u0017\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R0\u0010\u001b\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0019j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002`\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/facebook/internal/a0$a;", "", "", "original", "replace", "Lbn/r;", "e", "accessToken", "d", "Lcom/facebook/LoggingBehavior;", "behavior", "tag", TypedValues.Custom.S_STRING, "b", "format", "", "args", "c", "(Lcom/facebook/LoggingBehavior;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V", "", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "a", InneractiveMediationDefs.GENDER_FEMALE, "LOG_TAG_BASE", "Ljava/lang/String;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "stringsToReplace", "Ljava/util/HashMap;", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(tn.i iVar) {
            this();
        }

        public final void a(@NotNull LoggingBehavior loggingBehavior, int i10, @NotNull String str, @NotNull String str2) {
            tn.p.k(loggingBehavior, "behavior");
            tn.p.k(str, "tag");
            tn.p.k(str2, TypedValues.Custom.S_STRING);
            if (k2.t.H(loggingBehavior)) {
                String strF = f(str2);
                if (!bo.a0.W(str, "FacebookSDK.", false, 2, null)) {
                    str = tn.p.t("FacebookSDK.", str);
                }
                Log.println(i10, str, strF);
                if (loggingBehavior == LoggingBehavior.DEVELOPER_ERRORS) {
                    new Exception().printStackTrace();
                }
            }
        }

        public final void b(@NotNull LoggingBehavior loggingBehavior, @NotNull String str, @NotNull String str2) {
            tn.p.k(loggingBehavior, "behavior");
            tn.p.k(str, "tag");
            tn.p.k(str2, TypedValues.Custom.S_STRING);
            a(loggingBehavior, 3, str, str2);
        }

        public final void c(@NotNull LoggingBehavior behavior, @NotNull String tag, @NotNull String format, @NotNull Object... args) {
            tn.p.k(behavior, "behavior");
            tn.p.k(tag, "tag");
            tn.p.k(format, "format");
            tn.p.k(args, "args");
            if (k2.t.H(behavior)) {
                tn.x xVar = tn.x.f85368a;
                Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
                String str = String.format(format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                tn.p.j(str, "java.lang.String.format(format, *args)");
                a(behavior, 3, tag, str);
            }
        }

        public final synchronized void d(@NotNull String str) {
            tn.p.k(str, "accessToken");
            k2.t tVar = k2.t.f72784a;
            if (!k2.t.H(LoggingBehavior.INCLUDE_ACCESS_TOKENS)) {
                e(str, "ACCESS_TOKEN_REMOVED");
            }
        }

        public final synchronized void e(@NotNull String str, @NotNull String str2) {
            tn.p.k(str, "original");
            tn.p.k(str2, "replace");
            a0.f15302f.put(str, str2);
        }

        public final synchronized String f(String string) {
            String strS;
            strS = string;
            for (Map.Entry entry : a0.f15302f.entrySet()) {
                strS = bo.a0.S(strS, (String) entry.getKey(), (String) entry.getValue(), false, 4, null);
            }
            return strS;
        }
    }

    public a0(@NotNull LoggingBehavior loggingBehavior, @NotNull String str) {
        tn.p.k(loggingBehavior, "behavior");
        tn.p.k(str, "tag");
        this.priority = 3;
        this.behavior = loggingBehavior;
        this.tag = tn.p.t("FacebookSDK.", k0.l(str, "tag"));
        this.contents = new StringBuilder();
    }

    public final void b(@NotNull String str) {
        tn.p.k(str, TypedValues.Custom.S_STRING);
        if (g()) {
            this.contents.append(str);
        }
    }

    public final void c(@NotNull String format, @NotNull Object... args) {
        tn.p.k(format, "format");
        tn.p.k(args, "args");
        if (g()) {
            StringBuilder sb2 = this.contents;
            tn.x xVar = tn.x.f85368a;
            Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
            String str = String.format(format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            tn.p.j(str, "java.lang.String.format(format, *args)");
            sb2.append(str);
        }
    }

    public final void d(@NotNull String str, @NotNull Object obj) {
        tn.p.k(str, "key");
        tn.p.k(obj, "value");
        c("  %s:\t%s\n", str, obj);
    }

    public final void e() {
        String string = this.contents.toString();
        tn.p.j(string, "contents.toString()");
        f(string);
        this.contents = new StringBuilder();
    }

    public final void f(@NotNull String str) {
        tn.p.k(str, TypedValues.Custom.S_STRING);
        INSTANCE.a(this.behavior, this.priority, this.tag, str);
    }

    public final boolean g() {
        k2.t tVar = k2.t.f72784a;
        return k2.t.H(this.behavior);
    }
}
