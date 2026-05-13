package androidx.compose.ui.text.input;

import kotlin.Metadata;

/* JADX INFO: compiled from: GapBuffer.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a2\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u0002¨\u0006\t"}, d2 = {"", "", "destination", "", "destinationOffset", "startIndex", "endIndex", "Lbn/r;", "toCharArray", "ui-text_release"}, k = 2, mv = {1, 6, 0})
public final class GapBufferKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void toCharArray(String str, char[] cArr, int i10, int i11, int i12) {
        for (int i13 = i11; i13 < i12; i13++) {
            cArr[(i10 + i13) - i11] = str.charAt(i13);
        }
    }

    public static /* synthetic */ void toCharArray$default(String str, char[] cArr, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = str.length();
        }
        toCharArray(str, cArr, i10, i11, i12);
    }
}
