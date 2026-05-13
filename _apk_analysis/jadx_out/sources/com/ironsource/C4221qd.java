package com.ironsource;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.qd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C4221qd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f33350a = new a(null);

    /* JADX INFO: renamed from: com.ironsource.qd$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(tn.i iVar) {
            this();
        }

        private static final GradientDrawable a() {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setColor(Color.parseColor("#000000"));
            return gradientDrawable;
        }

        private final View a(Context context) {
            TextView textView = new TextView(context);
            textView.setText("i");
            textView.setTypeface(Typeface.DEFAULT_BOLD);
            textView.setTextSize(15.0f);
            textView.setBackground(a());
            textView.setAlpha(0.2f);
            textView.setPadding(21, 0, 21, 0);
            textView.setTextColor(Color.parseColor("#FFFFFF"));
            return textView;
        }

        @NotNull
        public final View a(@NotNull Context context, @Nullable String str, @NotNull X8 x82) {
            tn.p.k(context, GAMConfig.KEY_CONTEXT);
            tn.p.k(x82, "imageLoader");
            if (str == null) {
                return a(context);
            }
            Object objA = x82.a(str);
            if (Result.m7539isFailureimpl(objA)) {
                objA = null;
            }
            Drawable drawable = (Drawable) objA;
            if (drawable == null) {
                return a(context);
            }
            ImageView imageView = new ImageView(context);
            imageView.setImageDrawable(drawable);
            return imageView;
        }
    }
}
