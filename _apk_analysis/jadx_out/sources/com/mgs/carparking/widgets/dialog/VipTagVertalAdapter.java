package com.mgs.carparking.widgets.dialog;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.dramarush.shortin.R;
import com.mgs.carparking.netbean.VipListItemEntry;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class VipTagVertalAdapter extends RecyclerView.Adapter<b> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List<VipListItemEntry> f45337i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LayoutInflater f45338j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c f45339k;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f45340b;

        public a(int i10) {
            this.f45340b = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (VipTagVertalAdapter.this.f45339k != null) {
                VipTagVertalAdapter.this.f45339k.a(this.f45340b);
            }
        }
    }

    public class b extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public LinearLayout f45342l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public TextView f45343m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public TextView f45344n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public TextView f45345o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public ImageView f45346p;

        public b(@NonNull View view) {
            super(view);
            this.f45342l = (LinearLayout) view.findViewById(R.id.ll_click);
            this.f45343m = (TextView) view.findViewById(R.id.tv_title);
            this.f45346p = (ImageView) view.findViewById(R.id.iv_select);
            this.f45344n = (TextView) view.findViewById(R.id.tv_price_normal);
            this.f45345o = (TextView) view.findViewById(R.id.tv_price);
        }
    }

    public interface c {
        void a(int i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i10) {
        if (this.f45337i.get(i10).isCheck()) {
            bVar.f45346p.setImageResource(R.drawable.ic_vip_selected);
            bVar.f45342l.setBackgroundResource(R.drawable.bg_vip_item_selected);
        } else {
            bVar.f45346p.setImageResource(R.drawable.ic_vip_normal);
            bVar.f45342l.setBackgroundResource(R.drawable.bg_vip_item_normal);
        }
        bVar.f45343m.setText(this.f45337i.get(i10).getTitle());
        bVar.f45344n.setText(this.f45337i.get(i10).getPrice_original());
        bVar.f45344n.getPaint().setFlags(16);
        bVar.f45345o.setText(this.f45337i.get(i10).getPrice());
        bVar.f45342l.setOnClickListener(new a(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return new b(this.f45338j.inflate(R.layout.item_vip_vertal_tag, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f45337i.size();
    }
}
