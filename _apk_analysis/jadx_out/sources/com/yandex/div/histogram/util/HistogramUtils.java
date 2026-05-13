package com.yandex.div.histogram.util;

import com.yandex.div.histogram.HistogramRecordConfiguration;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: HistogramUtils.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class HistogramUtils {

    @NotNull
    public static final HistogramUtils INSTANCE = new HistogramUtils();

    private HistogramUtils() {
    }

    public final boolean shouldRecordHistogram(@NotNull String str, @NotNull HistogramRecordConfiguration histogramRecordConfiguration) {
        int iHashCode = str.hashCode();
        if (iHashCode != 2106116) {
            if (iHashCode != 2106217) {
                if (iHashCode == 2688677 && str.equals("Warm")) {
                    return histogramRecordConfiguration.isWarmRecordingEnabled();
                }
            } else if (str.equals("Cool")) {
                return histogramRecordConfiguration.isCoolRecordingEnabled();
            }
        } else if (str.equals("Cold")) {
            return histogramRecordConfiguration.isColdRecordingEnabled();
        }
        KAssert kAssert = KAssert.INSTANCE;
        if (Assert.isEnabled()) {
            Assert.fail("Unknown histogram call type: " + str);
        }
        return false;
    }
}
