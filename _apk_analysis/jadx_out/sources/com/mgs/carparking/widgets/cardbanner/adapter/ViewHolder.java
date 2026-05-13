package com.mgs.carparking.widgets.cardbanner.adapter;

import android.view.View;
import android.widget.TextView;
import com.dramarush.shortin.R;
import com.mgs.carparking.widgets.cardbanner.view.RoundedImageView;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: ViewHolder.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewHolder extends BannerViewHolder {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public RoundedImageView f45127l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public TextView f45128m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public TextView f45129n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewHolder(@NotNull View view) {
        super(view);
        p.k(view, "itemView");
        View viewFindViewById = view.findViewById(R.id.item_img);
        p.i(viewFindViewById, "null cannot be cast to non-null type com.mgs.carparking.widgets.cardbanner.view.RoundedImageView");
        this.f45127l = (RoundedImageView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.main_text);
        p.i(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        this.f45128m = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.subtitle_text);
        p.i(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        this.f45129n = (TextView) viewFindViewById3;
    }

    @NotNull
    public final TextView b() {
        return this.f45128m;
    }

    @NotNull
    public final RoundedImageView c() {
        return this.f45127l;
    }

    @NotNull
    public final TextView d() {
        return this.f45129n;
    }
}
