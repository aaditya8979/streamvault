package yads;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.mobile.ads.R$layout;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class w40 extends ListAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wk3 f96283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final il3 f96284b;

    public /* synthetic */ w40(bc1 bc1Var, z70 z70Var) {
        this(new wk3(bc1Var, z70Var), new il3());
    }

    public w40(wk3 wk3Var, il3 il3Var) {
        super(new t70());
        this.f96283a = wk3Var;
        this.f96284b = il3Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i10) {
        ba0 ba0Var = (ba0) getItem(i10);
        this.f96284b.getClass();
        if (ba0Var instanceof u90) {
            return R$layout.debug_panel_item_action_button;
        }
        if (ba0Var instanceof aa0) {
            return R$layout.debug_panel_item_switch;
        }
        if (ba0Var instanceof v90) {
            return R$layout.debug_panel_item_divider;
        }
        if (ba0Var instanceof w90) {
            return R$layout.deubg_panel_item_header;
        }
        if (ba0Var instanceof x90) {
            return R$layout.deubg_panel_item_key_value;
        }
        if (ba0Var instanceof y90) {
            return R$layout.debug_panel_item_mediation_adapter;
        }
        if (ba0Var instanceof s90) {
            return R$layout.debug_panel_item_ad_units;
        }
        if (ba0Var instanceof r90) {
            return R$layout.debug_panel_item_ad_unit;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i10) {
        ((ea0) viewHolder).a((ba0) getItem(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(i10, viewGroup, false);
        wk3 wk3Var = this.f96283a;
        wk3Var.getClass();
        return i10 == R$layout.debug_panel_item_action_button ? new n0(pk3.f93626b, viewInflate) : i10 == R$layout.debug_panel_item_switch ? new c53(viewInflate, new rk3(wk3Var)) : i10 == R$layout.deubg_panel_item_header ? new u01(viewInflate) : i10 == R$layout.deubg_panel_item_key_value ? new je1(viewInflate) : i10 == R$layout.debug_panel_item_mediation_adapter ? new mr1(viewInflate, wk3Var.f96431b, new sk3(wk3Var), new tk3(wk3Var)) : i10 == R$layout.debug_panel_item_ad_units ? new rb(viewInflate, new uk3(wk3Var)) : i10 == R$layout.debug_panel_item_ad_unit ? new pb(new vk3(wk3Var), viewInflate) : new xi0(viewInflate);
    }
}
