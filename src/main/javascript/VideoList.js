import {useState,useEffect} from "react";

export const VideoList = () => {
    const [videos, setVideo] = useState([]);
    useEffect(() => {
        fetch("/api/videos")
            .then((data) => data.json())
            .then((d) => setVideo(d));
    }, []);
    return(
        <ul>
            {videos.map((video)=><li>{video.name}</li>)}
        </ul>
    )
}