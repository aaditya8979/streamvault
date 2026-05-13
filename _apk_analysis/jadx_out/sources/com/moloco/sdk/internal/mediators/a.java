package com.moloco.sdk.internal.mediators;

import co.d;
import kotlin.time.DurationUnit;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: loaded from: classes6.dex */
public final class a {
    public static final long a(@Nullable String str) {
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != 76100) {
                if (iHashCode != 63085501) {
                    if (iHashCode == 347625656 && str.equals("LevelPlay")) {
                        return d.s(8, DurationUnit.SECONDS);
                    }
                } else if (str.equals("AdMob")) {
                    return d.s(8, DurationUnit.SECONDS);
                }
            } else if (str.equals("MAX")) {
                return d.s(8, DurationUnit.SECONDS);
            }
        }
        return d.s(60, DurationUnit.SECONDS);
    }

    public static final long b(@Nullable String str) {
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != 76100) {
                if (iHashCode != 63085501) {
                    if (iHashCode == 347625656 && str.equals("LevelPlay")) {
                        return d.s(26, DurationUnit.SECONDS);
                    }
                } else if (str.equals("AdMob")) {
                    return d.s(26, DurationUnit.SECONDS);
                }
            } else if (str.equals("MAX")) {
                return d.s(26, DurationUnit.SECONDS);
            }
        }
        return d.s(60, DurationUnit.SECONDS);
    }

    public static final long c(@Nullable String str) {
        return p.f(str, "MAX") ? d.s(8, DurationUnit.SECONDS) : p.f(str, "AdMob") ? d.s(58, DurationUnit.SECONDS) : d.s(60, DurationUnit.SECONDS);
    }
}
