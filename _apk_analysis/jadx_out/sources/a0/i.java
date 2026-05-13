package a0;

import cn.w0;
import coil.decode.ExifOrientationPolicy;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ExifUtils.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0016\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000\"\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\"\u0018\u0010\f\u001a\u00020\u0003*\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\"\u0018\u0010\r\u001a\u00020\u0003*\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcoil/decode/ExifOrientationPolicy;", "", "mimeType", "", "c", "", "a", "Ljava/util/Set;", "RESPECT_PERFORMANCE_MIME_TYPES", "La0/f;", "b", "(La0/f;)Z", "isSwapped", "isRotated", "coil-base_release"}, k = 2, mv = {1, 7, 1})
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Set<String> f3456a = w0.j("image/jpeg", "image/webp", "image/heic", "image/heif");

    /* JADX INFO: compiled from: ExifUtils.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ExifOrientationPolicy.values().length];
            iArr[ExifOrientationPolicy.RESPECT_PERFORMANCE.ordinal()] = 1;
            iArr[ExifOrientationPolicy.IGNORE.ordinal()] = 2;
            iArr[ExifOrientationPolicy.RESPECT_ALL.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean a(@NotNull f fVar) {
        return fVar.getRotationDegrees() > 0;
    }

    public static final boolean b(@NotNull f fVar) {
        return fVar.getRotationDegrees() == 90 || fVar.getRotationDegrees() == 270;
    }

    public static final boolean c(@NotNull ExifOrientationPolicy exifOrientationPolicy, @Nullable String str) {
        int i10 = a.$EnumSwitchMapping$0[exifOrientationPolicy.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return false;
            }
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        } else if (str == null || !f3456a.contains(str)) {
            return false;
        }
        return true;
    }
}
