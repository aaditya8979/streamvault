package androidx.compose.ui.text.font;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.text.ExperimentalTextApi;
import com.ironsource.C3978d4;
import java.io.File;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: AndroidFont.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a1\u0010\u0000\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a1\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u0012\u001a9\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u0013\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, d2 = {"Font", "Landroidx/compose/ui/text/font/Font;", "assetManager", "Landroid/content/res/AssetManager;", "path", "", ActivityChooserModel.ATTRIBUTE_WEIGHT, "Landroidx/compose/ui/text/font/FontWeight;", "style", "Landroidx/compose/ui/text/font/FontStyle;", "Font-wCLgNak", "(Landroid/content/res/AssetManager;Ljava/lang/String;Landroidx/compose/ui/text/font/FontWeight;I)Landroidx/compose/ui/text/font/Font;", "fileDescriptor", "Landroid/os/ParcelFileDescriptor;", "Font-RetOiIg", "(Landroid/os/ParcelFileDescriptor;Landroidx/compose/ui/text/font/FontWeight;I)Landroidx/compose/ui/text/font/Font;", C3978d4.i.f31327b, "Ljava/io/File;", "(Ljava/io/File;Landroidx/compose/ui/text/font/FontWeight;I)Landroidx/compose/ui/text/font/Font;", "(Ljava/lang/String;Landroid/content/res/AssetManager;Landroidx/compose/ui/text/font/FontWeight;I)Landroidx/compose/ui/text/font/Font;", "ui-text_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class AndroidFontKt {
    @ExperimentalTextApi
    @NotNull
    @Stable
    @RequiresApi(26)
    /* JADX INFO: renamed from: Font-RetOiIg, reason: not valid java name */
    public static final Font m3502FontRetOiIg(@NotNull ParcelFileDescriptor parcelFileDescriptor, @NotNull FontWeight fontWeight, int i10) {
        p.k(parcelFileDescriptor, "fileDescriptor");
        p.k(fontWeight, ActivityChooserModel.ATTRIBUTE_WEIGHT);
        return new Font(parcelFileDescriptor, fontWeight, i10, null);
    }

    @Stable
    @ExperimentalTextApi
    @NotNull
    /* JADX INFO: renamed from: Font-RetOiIg, reason: not valid java name */
    public static final Font m3503FontRetOiIg(@NotNull File file, @NotNull FontWeight fontWeight, int i10) {
        p.k(file, C3978d4.i.f31327b);
        p.k(fontWeight, ActivityChooserModel.ATTRIBUTE_WEIGHT);
        return new Font(file, fontWeight, i10, null);
    }

    /* JADX INFO: renamed from: Font-RetOiIg$default, reason: not valid java name */
    public static /* synthetic */ Font m3504FontRetOiIg$default(ParcelFileDescriptor parcelFileDescriptor, FontWeight fontWeight, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            fontWeight = FontWeight.INSTANCE.getNormal();
        }
        if ((i11 & 4) != 0) {
            i10 = FontStyle.INSTANCE.m3557getNormal_LCdwA();
        }
        return m3502FontRetOiIg(parcelFileDescriptor, fontWeight, i10);
    }

    /* JADX INFO: renamed from: Font-RetOiIg$default, reason: not valid java name */
    public static /* synthetic */ Font m3505FontRetOiIg$default(File file, FontWeight fontWeight, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            fontWeight = FontWeight.INSTANCE.getNormal();
        }
        if ((i11 & 4) != 0) {
            i10 = FontStyle.INSTANCE.m3557getNormal_LCdwA();
        }
        return m3503FontRetOiIg(file, fontWeight, i10);
    }

    @Stable
    @ExperimentalTextApi
    @NotNull
    /* JADX INFO: renamed from: Font-wCLgNak, reason: not valid java name */
    public static final Font m3506FontwCLgNak(@NotNull AssetManager assetManager, @NotNull String str, @NotNull FontWeight fontWeight, int i10) {
        p.k(assetManager, "assetManager");
        p.k(str, "path");
        p.k(fontWeight, ActivityChooserModel.ATTRIBUTE_WEIGHT);
        return new Font(assetManager, str, fontWeight, i10, null);
    }

    @Stable
    @ExperimentalTextApi
    @NotNull
    /* JADX INFO: renamed from: Font-wCLgNak, reason: not valid java name */
    public static final Font m3507FontwCLgNak(@NotNull String str, @NotNull AssetManager assetManager, @NotNull FontWeight fontWeight, int i10) {
        p.k(str, "path");
        p.k(assetManager, "assetManager");
        p.k(fontWeight, ActivityChooserModel.ATTRIBUTE_WEIGHT);
        return new Font(assetManager, str, fontWeight, i10, null);
    }

    /* JADX INFO: renamed from: Font-wCLgNak$default, reason: not valid java name */
    public static /* synthetic */ Font m3508FontwCLgNak$default(AssetManager assetManager, String str, FontWeight fontWeight, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            fontWeight = FontWeight.INSTANCE.getNormal();
        }
        if ((i11 & 8) != 0) {
            i10 = FontStyle.INSTANCE.m3557getNormal_LCdwA();
        }
        return m3506FontwCLgNak(assetManager, str, fontWeight, i10);
    }

    /* JADX INFO: renamed from: Font-wCLgNak$default, reason: not valid java name */
    public static /* synthetic */ Font m3509FontwCLgNak$default(String str, AssetManager assetManager, FontWeight fontWeight, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            fontWeight = FontWeight.INSTANCE.getNormal();
        }
        if ((i11 & 8) != 0) {
            i10 = FontStyle.INSTANCE.m3557getNormal_LCdwA();
        }
        return m3507FontwCLgNak(str, assetManager, fontWeight, i10);
    }
}
