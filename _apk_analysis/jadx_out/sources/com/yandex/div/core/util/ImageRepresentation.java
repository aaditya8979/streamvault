package com.yandex.div.core.util;

import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: ImageRepresentation.kt */
/* JADX INFO: loaded from: classes8.dex */
public interface ImageRepresentation {

    /* JADX INFO: compiled from: ImageRepresentation.kt */
    public static final class Bitmap implements ImageRepresentation {

        @NotNull
        private final android.graphics.Bitmap value;

        private /* synthetic */ Bitmap(android.graphics.Bitmap bitmap) {
            this.value = bitmap;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Bitmap m7382boximpl(android.graphics.Bitmap bitmap) {
            return new Bitmap(bitmap);
        }

        @NotNull
        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static android.graphics.Bitmap m7383constructorimpl(@NotNull android.graphics.Bitmap bitmap) {
            return bitmap;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m7384equalsimpl(android.graphics.Bitmap bitmap, Object obj) {
            return (obj instanceof Bitmap) && p.f(bitmap, ((Bitmap) obj).m7387unboximpl());
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m7385hashCodeimpl(android.graphics.Bitmap bitmap) {
            return bitmap.hashCode();
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m7386toStringimpl(android.graphics.Bitmap bitmap) {
            return "Bitmap(value=" + bitmap + ')';
        }

        public boolean equals(Object obj) {
            return m7384equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m7385hashCodeimpl(this.value);
        }

        public String toString() {
            return m7386toStringimpl(this.value);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ android.graphics.Bitmap m7387unboximpl() {
            return this.value;
        }
    }

    /* JADX INFO: compiled from: ImageRepresentation.kt */
    public static final class PictureDrawable implements ImageRepresentation {

        @NotNull
        private final android.graphics.drawable.PictureDrawable value;

        private /* synthetic */ PictureDrawable(android.graphics.drawable.PictureDrawable pictureDrawable) {
            this.value = pictureDrawable;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ PictureDrawable m7388boximpl(android.graphics.drawable.PictureDrawable pictureDrawable) {
            return new PictureDrawable(pictureDrawable);
        }

        @NotNull
        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static android.graphics.drawable.PictureDrawable m7389constructorimpl(@NotNull android.graphics.drawable.PictureDrawable pictureDrawable) {
            return pictureDrawable;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m7390equalsimpl(android.graphics.drawable.PictureDrawable pictureDrawable, Object obj) {
            return (obj instanceof PictureDrawable) && p.f(pictureDrawable, ((PictureDrawable) obj).m7393unboximpl());
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m7391hashCodeimpl(android.graphics.drawable.PictureDrawable pictureDrawable) {
            return pictureDrawable.hashCode();
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m7392toStringimpl(android.graphics.drawable.PictureDrawable pictureDrawable) {
            return "PictureDrawable(value=" + pictureDrawable + ')';
        }

        public boolean equals(Object obj) {
            return m7390equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m7391hashCodeimpl(this.value);
        }

        public String toString() {
            return m7392toStringimpl(this.value);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ android.graphics.drawable.PictureDrawable m7393unboximpl() {
            return this.value;
        }
    }
}
