package com.mgs.carparking.widgets.cardbanner.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.dramarush.shortin.R;
import com.mgs.carparking.widgets.cardbanner.view.RoundedImageView;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.List;
import nd.b;
import od.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.p;

/* JADX INFO: compiled from: CardAdapter.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class CardAdapter extends RecyclerView.Adapter<BannerViewHolder> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Context f45117i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f45118j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f45119k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f45120l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public List<b> f45121m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f45122n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public a f45123o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f45124p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f45125q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public pd.a f45126r;

    public CardAdapter(@NotNull Context context, int i10, int i11, int i12) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        this.f45117i = context;
        this.f45118j = i10;
        this.f45119k = i11;
        this.f45120l = i12;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull BannerViewHolder bannerViewHolder, int i10) {
        int size;
        a aVar;
        p.k(bannerViewHolder, "holder");
        View view = bannerViewHolder.itemView;
        List<b> list = this.f45121m;
        if (list != null) {
            p.h(list);
            size = list.size();
        } else {
            size = this.f45122n;
        }
        view.setTag(R.id.key_position, Integer.valueOf(i10 % size));
        bannerViewHolder.itemView.setTag(R.id.key_item, Integer.valueOf(i10));
        View view2 = bannerViewHolder.itemView;
        int i11 = this.f45120l;
        view2.setPadding(i11, 0, i11, 0);
        bannerViewHolder.itemView.setLayoutParams(new ViewGroup.LayoutParams(this.f45118j - (this.f45119k * 2), -1));
        if (this.f45122n != 0 && (aVar = this.f45123o) != null) {
            p.h(aVar);
            aVar.a(bannerViewHolder, i10 % this.f45122n);
            return;
        }
        ViewHolder viewHolder = (ViewHolder) bannerViewHolder;
        TextView textViewB = viewHolder.b();
        List<b> list2 = this.f45121m;
        p.h(list2);
        List<b> list3 = this.f45121m;
        p.h(list3);
        textViewB.setText(list2.get(i10 % list3.size()).b());
        viewHolder.b().setTextSize(this.f45124p);
        TextView textViewD = viewHolder.d();
        List<b> list4 = this.f45121m;
        p.h(list4);
        List<b> list5 = this.f45121m;
        p.h(list5);
        textViewD.setText(list4.get(i10 % list5.size()).c());
        viewHolder.d().setTextSize(this.f45125q);
        pd.a aVar2 = this.f45126r;
        if (aVar2 != null) {
            p.h(aVar2);
            Context context = this.f45117i;
            RoundedImageView roundedImageViewC = viewHolder.c();
            List<b> list6 = this.f45121m;
            p.h(list6);
            List<b> list7 = this.f45121m;
            p.h(list7);
            aVar2.a(context, roundedImageViewC, list6.get(i10 % list7.size()).a());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public BannerViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i10) {
        a aVar;
        p.k(viewGroup, "parent");
        if (this.f45122n != 0 && (aVar = this.f45123o) != null) {
            p.h(aVar);
            return aVar.b(viewGroup, i10);
        }
        View viewInflate = LayoutInflater.from(this.f45117i).inflate(R.layout.banner_item, viewGroup, false);
        p.j(viewInflate, "inflate(...)");
        return new ViewHolder(viewInflate);
    }

    public final void e(@Nullable a aVar) {
        this.f45123o = aVar;
    }

    public final void f(@Nullable pd.a aVar) {
        this.f45126r = aVar;
    }

    public final void g(int i10) {
        this.f45122n = i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (this.f45122n == 0 && this.f45121m == null) {
            return 0;
        }
        List<b> list = this.f45121m;
        if (list != null) {
            p.h(list);
            if (list.size() == 0) {
                return 0;
            }
        }
        return Integer.MAX_VALUE;
    }

    public final void h(@Nullable List<b> list) {
        this.f45121m = list;
    }

    public final void i(int i10, int i11) {
        this.f45124p = i10;
        this.f45125q = i11;
    }
}
