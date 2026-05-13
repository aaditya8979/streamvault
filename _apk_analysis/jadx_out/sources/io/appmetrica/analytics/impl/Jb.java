package io.appmetrica.analytics.impl;

import android.content.res.Configuration;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class Jb {
    public static List a(Configuration configuration) {
        return AndroidUtils.isApiAchieved(24) ? Kb.a(configuration) : cn.v.e(He.a(configuration.locale));
    }
}
