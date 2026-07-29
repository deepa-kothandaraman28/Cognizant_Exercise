import React from "react";
import "../Stylesheets/mystyle.css";

function CalculateScore(props) {

    let average = props.Total / props.goal;

    return (
        <div className="box">
            <h2>Student Score Details</h2>

            <p>Name: {props.Name}</p>

            <p>School: {props.School}</p>

            <p>Total Score: {props.Total}</p>

            <p>Goal: {props.goal}</p>

            <p>
                Average Score: {average}
            </p>
        </div>
    );
}

export default CalculateScore;