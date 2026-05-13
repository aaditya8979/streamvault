package io.bidmachine.util;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MathUtils.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J#\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0002\u0010\nJ#\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0002\u0010\u000bJ#\u0010\u0006\u001a\u0004\u0018\u00010\f2\b\u0010\b\u001a\u0004\u0018\u00010\f2\b\u0010\t\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0002\u0010\rJ#\u0010\u0006\u001a\u0004\u0018\u00010\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0002\u0010\u000fJ#\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0002\u0010\nJ#\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0002\u0010\u000bJ#\u0010\u0010\u001a\u0004\u0018\u00010\f2\b\u0010\b\u001a\u0004\u0018\u00010\f2\b\u0010\t\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0002\u0010\rJ#\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lio/bidmachine/util/MathUtils;", "", "()V", "SIN_PI_4", "", "SIN_PI_6", "max", "", "first", "second", "(Ljava/lang/Double;Ljava/lang/Double;)Ljava/lang/Double;", "(Ljava/lang/Float;Ljava/lang/Float;)Ljava/lang/Float;", "", "(Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/Integer;", "", "(Ljava/lang/Long;Ljava/lang/Long;)Ljava/lang/Long;", "min", "bidmachine-android-util_d_0_13_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class MathUtils {

    @NotNull
    public static final MathUtils INSTANCE = new MathUtils();
    public static final float SIN_PI_4 = 0.70710677f;
    public static final float SIN_PI_6 = 0.5f;

    private MathUtils() {
    }

    @Nullable
    public static final Double max(@Nullable Double first, @Nullable Double second) {
        if (first == null) {
            return second;
        }
        first.doubleValue();
        if (second == null) {
            return first;
        }
        second.doubleValue();
        return Double.valueOf(Math.max(first.doubleValue(), second.doubleValue()));
    }

    @Nullable
    public static final Float max(@Nullable Float first, @Nullable Float second) {
        if (first == null) {
            return second;
        }
        first.floatValue();
        if (second == null) {
            return first;
        }
        second.floatValue();
        return Float.valueOf(Math.max(first.floatValue(), second.floatValue()));
    }

    @Nullable
    public static final Integer max(@Nullable Integer first, @Nullable Integer second) {
        if (first == null) {
            return second;
        }
        first.intValue();
        if (second == null) {
            return first;
        }
        second.intValue();
        return Integer.valueOf(Math.max(first.intValue(), second.intValue()));
    }

    @Nullable
    public static final Long max(@Nullable Long first, @Nullable Long second) {
        if (first == null) {
            return second;
        }
        first.longValue();
        if (second == null) {
            return first;
        }
        second.longValue();
        return Long.valueOf(Math.max(first.longValue(), second.longValue()));
    }

    @Nullable
    public static final Double min(@Nullable Double first, @Nullable Double second) {
        if (first == null) {
            return second;
        }
        first.doubleValue();
        if (second == null) {
            return first;
        }
        second.doubleValue();
        return Double.valueOf(Math.min(first.doubleValue(), second.doubleValue()));
    }

    @Nullable
    public static final Float min(@Nullable Float first, @Nullable Float second) {
        if (first == null) {
            return second;
        }
        first.floatValue();
        if (second == null) {
            return first;
        }
        second.floatValue();
        return Float.valueOf(Math.min(first.floatValue(), second.floatValue()));
    }

    @Nullable
    public static final Integer min(@Nullable Integer first, @Nullable Integer second) {
        if (first == null) {
            return second;
        }
        first.intValue();
        if (second == null) {
            return first;
        }
        second.intValue();
        return Integer.valueOf(Math.min(first.intValue(), second.intValue()));
    }

    @Nullable
    public static final Long min(@Nullable Long first, @Nullable Long second) {
        if (first == null) {
            return second;
        }
        first.longValue();
        if (second == null) {
            return first;
        }
        second.longValue();
        return Long.valueOf(Math.min(first.longValue(), second.longValue()));
    }
}
