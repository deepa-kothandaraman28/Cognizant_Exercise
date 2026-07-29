import CalculateScore from "./Components/CalculateScore";

function App() {

  return (
    <div>
      <CalculateScore
        Name="Deepa"
        School="RMK Engineering College"
        Total={450}
        goal={5}
      />
    </div>
  );
}

export default App;