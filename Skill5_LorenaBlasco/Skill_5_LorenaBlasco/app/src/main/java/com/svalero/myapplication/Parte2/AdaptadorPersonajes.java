package com.svalero.myapplication.Parte2;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.svalero.myapplication.R;

import java.util.ArrayList;

public class AdaptadorPersonajes extends RecyclerView.Adapter<AdaptadorPersonajes.ViewHolderPersonajes> {
    ArrayList<PersonajeVo> listadoPersonajes;

    public AdaptadorPersonajes(ArrayList<PersonajeVo> listadoPersonajes) {
        this.listadoPersonajes = listadoPersonajes;
    }

    @Override
    public ViewHolderPersonajes onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, null, false);
        return new ViewHolderPersonajes(view);
    }

    @Override
    public void onBindViewHolder(ViewHolderPersonajes holder, int position) {
        holder.etiNombre.setText(listadoPersonajes.get(position).getNombre());
        holder.etiDescripcion.setText(listadoPersonajes.get(position).getInfo());
        holder.foto.setImageResource(listadoPersonajes.get(position).getFoto());
    }

    @Override
    public int getItemCount() {
        return listadoPersonajes.size();
    }


    public class ViewHolderPersonajes extends RecyclerView.ViewHolder {
        TextView etiNombre, etiDescripcion;
        ImageView foto;

        public ViewHolderPersonajes(View itemView) {
            super(itemView);
           etiNombre = (TextView) itemView.findViewById(R.id.idNombre);
              etiDescripcion = (TextView) itemView.findViewById(R.id.idInfo);
            foto = (ImageView) itemView.findViewById(R.id.idImagen);
        }


    }
}
