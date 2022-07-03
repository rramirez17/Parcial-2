package com.example.parcial_n2_grupo4;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends  RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>{

    private Context context;
    private List<Culebra> data;

    public RecyclerViewAdapter(Context context, List<Culebra> data){
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;
        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.cardview, parent, false);
        return new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, @SuppressLint("RecyclerView") int position) {

        holder.tvtitulo.setText(data.get(position).getTitulo());
        holder.imagenCulebra.setImageResource(data.get(position).getMiniatura());
        holder.cardView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, EspecieActivity.class);
                intent.putExtra("Titulo", data.get(position).getTitulo());
                intent.putExtra("Descripcion", data.get(position).getDescripcion());
                intent.putExtra("Miniatura", data.get(position).getMiniatura());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends  RecyclerView.ViewHolder{

        TextView tvtitulo;
        ImageView imagenCulebra;
        CardView cardView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvtitulo = (TextView)   itemView.findViewById(R.id.tv);
            imagenCulebra =  (ImageView) itemView.findViewById(R.id.imagenP);
            cardView =   (CardView) itemView.findViewById(R.id.cardViewid);
        }
    }
}
