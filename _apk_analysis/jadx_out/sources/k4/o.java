package k4;

import com.google.android.exoplayer.metadata.Metadata;
import com.google.android.exoplayer.metadata.id3.CommentFrame;
import com.google.android.exoplayer.metadata.id3.InternalFrame;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: GaplessInfoHolder.java */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f72900c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f72901a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f72902b = -1;

    public boolean a() {
        return (this.f72901a == -1 || this.f72902b == -1) ? false : true;
    }

    public final boolean b(String str) {
        Matcher matcher = f72900c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int i10 = Integer.parseInt(matcher.group(1), 16);
            int i11 = Integer.parseInt(matcher.group(2), 16);
            if (i10 <= 0 && i11 <= 0) {
                return false;
            }
            this.f72901a = i10;
            this.f72902b = i11;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public boolean c(Metadata metadata) {
        for (int i10 = 0; i10 < metadata.e(); i10++) {
            Metadata.Entry entryD = metadata.d(i10);
            if (entryD instanceof CommentFrame) {
                CommentFrame commentFrame = (CommentFrame) entryD;
                if ("iTunSMPB".equals(commentFrame.f20273d) && b(commentFrame.f20274e)) {
                    return true;
                }
            } else if (entryD instanceof InternalFrame) {
                InternalFrame internalFrame = (InternalFrame) entryD;
                if ("com.apple.iTunes".equals(internalFrame.f20280c) && "iTunSMPB".equals(internalFrame.f20281d) && b(internalFrame.f20282e)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public boolean d(int i10) {
        int i11 = i10 >> 12;
        int i12 = i10 & 4095;
        if (i11 <= 0 && i12 <= 0) {
            return false;
        }
        this.f72901a = i11;
        this.f72902b = i12;
        return true;
    }
}
