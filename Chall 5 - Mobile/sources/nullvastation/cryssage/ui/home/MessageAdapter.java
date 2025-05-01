package com.nullvastation.cryssage.ui.home;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.nullvastation.cryssage.databinding.ItemMessageBinding;
import com.nullvastation.cryssage.ui.home.MessageAdapter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* compiled from: MessageAdapter.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0014\u0010\u0011\u001a\u00020\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/nullvastation/cryssage/ui/home/MessageAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/nullvastation/cryssage/ui/home/MessageAdapter$MessageViewHolder;", "messages", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/nullvastation/cryssage/ui/home/Message;", "(Ljava/util/List;)V", "getItemCount", HttpUrl.FRAGMENT_ENCODE_SET, "onBindViewHolder", HttpUrl.FRAGMENT_ENCODE_SET, "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateMessages", "newMessages", "MessageViewHolder", "app_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class MessageAdapter extends RecyclerView.Adapter<MessageViewHolder> {
    private List<Message> messages;

    public MessageAdapter(List<Message> messages) {
        Intrinsics.checkNotNullParameter(messages, "messages");
        this.messages = messages;
    }

    /* compiled from: MessageAdapter.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/nullvastation/cryssage/ui/home/MessageAdapter$MessageViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/nullvastation/cryssage/databinding/ItemMessageBinding;", "(Lcom/nullvastation/cryssage/databinding/ItemMessageBinding;)V", "isWarningVisible", HttpUrl.FRAGMENT_ENCODE_SET, "bind", HttpUrl.FRAGMENT_ENCODE_SET, "message", "Lcom/nullvastation/cryssage/ui/home/Message;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class MessageViewHolder extends RecyclerView.ViewHolder {
        private final ItemMessageBinding binding;
        private boolean isWarningVisible;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MessageViewHolder(ItemMessageBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.binding = binding;
        }

        public final void bind(final Message message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.binding.senderName.setText(message.getSender());
            this.binding.timestamp.setText(message.getTimestamp());
            this.binding.messageContent.setText(message.getContent());
            this.binding.warningMessage.setVisibility(8);
            this.binding.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.nullvastation.cryssage.ui.home.MessageAdapter$MessageViewHolder$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MessageAdapter.MessageViewHolder.bind$lambda$0(Message.this, this, view);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$0(Message message, MessageViewHolder this$0, View view) {
            Intrinsics.checkNotNullParameter(message, "$message");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (message.isEncrypted()) {
                this$0.isWarningVisible = !this$0.isWarningVisible;
                this$0.binding.warningMessage.setVisibility(this$0.isWarningVisible ? 0 : 8);
                if (this$0.isWarningVisible) {
                    Toast.makeText(this$0.binding.getRoot().getContext(), "Error : Unable to decipher the message..", 0).show();
                }
            }
        }
    }

    public final void updateMessages(List<Message> newMessages) {
        Intrinsics.checkNotNullParameter(newMessages, "newMessages");
        this.messages = newMessages;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public MessageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ItemMessageBinding inflate = ItemMessageBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new MessageViewHolder(inflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(MessageViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.messages.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.messages.size();
    }
}
