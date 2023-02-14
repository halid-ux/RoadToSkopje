import React from 'react';
import { MapContainer, TileLayer, Marker, Popup } from "react-leaflet";
import "../../index.css";

export default function LocationMapView({lon, lat, name}) {
    console.log(lon)
    console.log(lat)
    return (
        <>
          <MapContainer center={[lon,lat]} zoom={12}  >
              <TileLayer
              
                  attribution='&copy; <a href="http://osm.org/copyright">OpenStreetMap</a> contributors'
                  url="https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png"
              />
                
              <Marker position={[lon, lat]}>

                  <Popup>
                      {name}
                  </Popup>
              </Marker>
          </MapContainer>
            </>
        
    );    
}
