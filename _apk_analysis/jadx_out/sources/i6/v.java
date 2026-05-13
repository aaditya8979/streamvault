package i6;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import s7.m0;

/* JADX INFO: compiled from: GaplessInfoHolder.java */
/* JADX INFO: loaded from: classes3.dex */
public final class v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f63936c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f63937a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f63938b = -1;

    public boolean a() {
        return (this.f63937a == -1 || this.f63938b == -1) ? false : true;
    }

    public final boolean b(String str) {
        Matcher matcher = f63936c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int i10 = Integer.parseInt((String) m0.j(matcher.group(1)), 16);
            int i11 = Integer.parseInt((String) m0.j(matcher.group(2)), 16);
            if (i10 <= 0 && i11 <= 0) {
                return false;
            }
            this.f63937a = i10;
            this.f63938b = i11;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public boolean c(Metadata metadata) {
        for (int i10 = 0; i10 < metadata.f(); i10++) {
            Metadata.Entry entryE = metadata.e(i10);
            if (entryE instanceof CommentFrame) {
                CommentFrame commentFrame = (CommentFrame) entryE;
                if ("iTunSMPB".equals(commentFrame.f21928d) && b(commentFrame.f21929e)) {
                    return true;
                }
            } else if (entryE instanceof InternalFrame) {
                InternalFrame internalFrame = (InternalFrame) entryE;
                if ("com.apple.iTunes".equals(internalFrame.f21935c) && "iTunSMPB".equals(internalFrame.f21936d) && b(internalFrame.f21937e)) {
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
        this.f63937a = i11;
        this.f63938b = i12;
        return true;
    }
}
