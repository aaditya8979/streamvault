package com.mgs.carparking.widgets.dialog.cling;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.dramarush.shortin.R;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C3978d4;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.e;
import tn.p;

/* JADX INFO: compiled from: DeviceAdapter.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DeviceAdapter extends RecyclerView.Adapter<DeviceHolder> implements e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final a f45387i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final LayoutInflater f45388j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final List<qr.a<?, ?, ?>> f45389k;

    /* JADX INFO: compiled from: DeviceAdapter.kt */
    public final class DeviceHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @NotNull
        public final a f45390l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @NotNull
        public final TextView f45391m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ DeviceAdapter f45392n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeviceHolder(@NotNull DeviceAdapter deviceAdapter, @NotNull View view, a aVar) {
            super(view);
            p.k(view, "itemView");
            p.k(aVar, "itemSelectedListener");
            this.f45392n = deviceAdapter;
            this.f45390l = aVar;
            View viewFindViewById = view.findViewById(R.id.device_name);
            p.j(viewFindViewById, "findViewById(...)");
            this.f45391m = (TextView) viewFindViewById;
            view.setOnClickListener(this);
        }

        public final void b(@Nullable qr.a<?, ?, ?> aVar) {
            this.itemView.setTag(aVar);
            if (aVar != null) {
                this.f45391m.setText(aVar.m().d());
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(@NotNull View view) {
            p.k(view, "v");
            Object tag = view.getTag();
            qr.a<?, ?, ?> aVar = tag instanceof qr.a ? (qr.a) tag : null;
            if (aVar != null) {
                this.f45390l.b(aVar);
            }
        }
    }

    /* JADX INFO: compiled from: DeviceAdapter.kt */
    public interface a {
        void a();

        void b(@NotNull qr.a<?, ?, ?> aVar);
    }

    public DeviceAdapter(@NotNull Context context, @NotNull a aVar) {
        p.k(context, GAMConfig.KEY_CONTEXT);
        p.k(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f45387i = aVar;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        p.j(layoutInflaterFrom, "from(...)");
        this.f45388j = layoutInflaterFrom;
        this.f45389k = new ArrayList();
    }

    @Override // q0.e
    public void a(@NotNull qr.a<?, ?, ?> aVar) {
        p.k(aVar, C3978d4.i.G);
        Log.e("onDeviceAdded", aVar.m().d());
        if (this.f45389k.contains(aVar)) {
            return;
        }
        this.f45387i.a();
        this.f45389k.add(aVar);
        notifyDataSetChanged();
    }

    @Override // q0.e
    public void b(@NotNull qr.a<?, ?, ?> aVar) {
        p.k(aVar, C3978d4.i.G);
        if (this.f45389k.contains(aVar)) {
            this.f45389k.remove(aVar);
            notifyDataSetChanged();
        }
    }

    public final qr.a<?, ?, ?> c(int i10) {
        if (i10 < 0 || i10 >= getItemCount()) {
            return null;
        }
        return this.f45389k.get(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull DeviceHolder deviceHolder, int i10) {
        p.k(deviceHolder, "holder");
        deviceHolder.b(c(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public DeviceHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i10) {
        p.k(viewGroup, "parent");
        View viewInflate = this.f45388j.inflate(R.layout.item_device, viewGroup, false);
        p.j(viewInflate, "inflate(...)");
        return new DeviceHolder(this, viewInflate, this.f45387i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f45389k.size();
    }
}
