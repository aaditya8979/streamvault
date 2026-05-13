package com.yandex.div.core.view2.errors;

import android.view.ViewGroup;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import bn.r;
import org.jetbrains.annotations.NotNull;
import sn.l;
import sn.q;
import tn.p;

/* JADX INFO: compiled from: VariableMonitorView.kt */
/* JADX INFO: loaded from: classes9.dex */
final class VariableAdapter extends ListAdapter<VariableModel, VariableViewHolder> {

    @NotNull
    private final q<String, String, String, r> variableMutator;

    /* JADX INFO: compiled from: VariableMonitorView.kt */
    public static final class VariableDiffUtilCallback extends DiffUtil.ItemCallback<VariableModel> {
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areContentsTheSame(@NotNull VariableModel variableModel, @NotNull VariableModel variableModel2) {
            return p.f(variableModel.getValue(), variableModel2.getValue());
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areItemsTheSame(@NotNull VariableModel variableModel, @NotNull VariableModel variableModel2) {
            return p.f(variableModel.getName(), variableModel2.getName());
        }
    }

    /* JADX INFO: compiled from: VariableMonitorView.kt */
    public static final class VariableViewHolder extends RecyclerView.ViewHolder {

        @NotNull
        private final VariableView root;

        @NotNull
        private final q<String, String, String, r> variableMutator;

        /* JADX WARN: Multi-variable type inference failed */
        public VariableViewHolder(@NotNull VariableView variableView, @NotNull q<? super String, ? super String, ? super String, r> qVar) {
            super(variableView);
            this.root = variableView;
            this.variableMutator = qVar;
        }

        private final String fullName(VariableModel variableModel) {
            if (!(variableModel.getPath().length() > 0)) {
                return variableModel.getName();
            }
            return variableModel.getPath() + '/' + variableModel.getName();
        }

        private final int inputType(VariableModel variableModel) {
            String type = variableModel.getType();
            return p.f(type, "number") ? true : p.f(type, TypedValues.Custom.S_INT) ? 2 : 1;
        }

        public final void bind(@NotNull final VariableModel variableModel) {
            VariableView variableView = this.root;
            variableView.getNameText().setText(fullName(variableModel));
            variableView.getTypeText().setText(variableModel.getType());
            variableView.getValueText().setText(variableModel.getValue());
            variableView.getValueText().setInputType(inputType(variableModel));
            variableView.setOnEnterAction(new l<String, r>() { // from class: com.yandex.div.core.view2.errors.VariableAdapter$VariableViewHolder$bind$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // sn.l
                public /* bridge */ /* synthetic */ r invoke(String str) {
                    invoke2(str);
                    return r.f5635a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull String str) {
                    this.this$0.variableMutator.invoke(variableModel.getName(), variableModel.getPath(), str);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VariableAdapter(@NotNull q<? super String, ? super String, ? super String, r> qVar) {
        super(new VariableDiffUtilCallback());
        this.variableMutator = qVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull VariableViewHolder variableViewHolder, int i10) {
        variableViewHolder.bind(getCurrentList().get(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public VariableViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup, int i10) {
        return new VariableViewHolder(new VariableView(viewGroup.getContext()), this.variableMutator);
    }
}
