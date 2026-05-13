package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i;
import java.util.List;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final n0 f48494a = new n0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Regex f48495b = new Regex("<meta\\s+name=[\"']templateName[\"']\\s+content=[\"']([^\"']+)[\"']", RegexOption.IGNORE_CASE);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f48496c = 8;

    public final boolean a(@NotNull String str) {
        tn.p.k(str, "adm");
        return bo.d0.a0(str, "mraid.js", true);
    }

    public final boolean b(@NotNull String str) {
        tn.p.k(str, "adm");
        return bo.d0.a0(str, "<VAST", true);
    }

    @NotNull
    public final i c(@NotNull String str) {
        tn.p.k(str, "adm");
        i iVarE = e(str);
        return iVarE == null ? d(str) : iVarE;
    }

    public final i d(String str) {
        return b(str) ? i.f47726a : a(str) ? i.f47727b : i.f47728c;
    }

    public final i e(String str) {
        List<String> listB;
        String str2;
        bo.l lVarFind$default = Regex.find$default(f48495b, str, 0, 2, null);
        if (lVarFind$default == null || (listB = lVarFind$default.b()) == null || (str2 = listB.get(1)) == null) {
            return null;
        }
        if (bo.a0.U(str2, "video", true)) {
            return i.f47729d;
        }
        if (bo.a0.J(str2, "mraid", true)) {
            return i.f47730e;
        }
        if (bo.a0.J(str2, "static", true)) {
            return i.f47731f;
        }
        com.moloco.sdk.acm.recorder.a.Companion.b().b(new com.moloco.sdk.acm.b(com.moloco.sdk.internal.client_metrics_data.b.Y.c()).e("template_name", str2));
        return i.f47731f;
    }
}
