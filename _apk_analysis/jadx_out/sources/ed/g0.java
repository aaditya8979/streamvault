package ed;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.format.Formatter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.text.DecimalFormat;
import org.eclipse.jetty.util.security.Constraint;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SystemInfoUtils.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final g0 f61064a = new g0();

    @NotNull
    public static final String a(long j10) {
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        if (j10 == 0) {
            return "0B";
        }
        if (j10 < 1024) {
            return decimalFormat.format(j10) + 'B';
        }
        if (j10 < PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
            return decimalFormat.format(j10 / ((double) 1024)) + "KB";
        }
        if (j10 < 1073741824) {
            return decimalFormat.format(j10 / ((double) 1048576)) + "MB";
        }
        return decimalFormat.format(j10 / ((double) 1073741824)) + "GB";
    }

    @NotNull
    public static final String b(@Nullable Context context) {
        if (!tn.p.f(Environment.getExternalStorageState(), "mounted")) {
            return "sdcard unable!";
        }
        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
        String fileSize = Formatter.formatFileSize(context, ((long) (statFs.getBlockCount() - statFs.getAvailableBlocks())) * ((long) statFs.getBlockSize()));
        tn.p.h(fileSize);
        return fileSize;
    }

    @NotNull
    public static final String c(@Nullable Context context) {
        if (!tn.p.f(Environment.getExternalStorageState(), "mounted")) {
            return "sdcard unable!";
        }
        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
        String fileSize = Formatter.formatFileSize(context, statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
        tn.p.h(fileSize);
        return fileSize;
    }

    public final boolean d(boolean z10) {
        String strS = l0.s();
        if ((strS == null || strS.length() == 0) || tn.p.f(l0.s(), "none") || tn.p.f(l0.s(), Constraint.NONE)) {
            return false;
        }
        String strS2 = l0.s();
        tn.p.h(strS2);
        if (bo.d0.U0(strS2, new String[]{StringUtils.COMMA}, false, 0, 6, null).size() < 2) {
            return false;
        }
        return (l0.O() == 0 && !z10) || l0.O() != 1 || z10;
    }
}
