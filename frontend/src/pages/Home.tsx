import { useEffect, useState } from "react";
import { fetchPlayers } from "../services/playerService";
import type {Player} from "../types/Player";
import PlayerCard from "../components/PlayerCard";


const Home = () => {
    const [players, setPlayers] = useState<Player[]>([]);
    const [team, setTeam] = useState("");
    const [position, setPosition] = useState("");
    const [name, setName] = useState("");

    useEffect(() => {
        fetchPlayers(team, name, position).then(setPlayers);
    }, [team, name, position]);

    return (
        <div>
            <h1>Hoop Metrics</h1>
            <div className="search-bar-group">
                <input
                    className="search-bar"
                    type="text"
                    placeholder="Search players..."
                    value={name}
                    onChange={(e) => setName(e.target.value)}
                />

                <select
                    className="search-bar"
                    value={team}
                    onChange={(e) => setTeam(e.target.value)}
                >
                    <option value="">Select team...</option>
                    <option value="ATL">Atlanta Hawks</option>
                    <option value="BOS">Boston Celtics</option>
                    <option value="BRK">Brooklyn Nets</option>
                    <option value="CHO">Charlotte Hornets</option>
                    <option value="CHI">Chicago Bulls</option>
                    <option value="CLE">Cleveland Cavaliers</option>
                    <option value="DAL">Dallas Mavericks</option>
                    <option value="DEN">Denver Nuggets</option>
                    <option value="DET">Detroit Pistons</option>
                    <option value="GSW">Golden State Warriors</option>
                    <option value="HOU">Houston Rockets</option>
                    <option value="IND">Indiana Pacers</option>
                    <option value="LAC">Los Angeles Clippers</option>
                    <option value="LAL">Los Angeles Lakers</option>
                    <option value="MEM">Memphis Grizzlies</option>
                    <option value="MIA">Miami Heat</option>
                    <option value="MIL">Milwaukee Bucks</option>
                    <option value="MIN">Minnesota Timberwolves</option>
                    <option value="NOP">New Orleans Pelicans</option>
                    <option value="NYK">New York Knicks</option>
                    <option value="OKC">Oklahoma City Thunder</option>
                    <option value="ORL">Orlando Magic</option>
                    <option value="PHI">Philadelphia 76ers</option>
                    <option value="PHO">Phoenix Suns</option>
                    <option value="POR">Portland Trail Blazers</option>
                    <option value="SAC">Sacramento Kings</option>
                    <option value="SAS">San Antonio Spurs</option>
                    <option value="TOR">Toronto Raptors</option>
                    <option value="UTA">Utah Jazz</option>
                    <option value="WAS">Washington Wizards</option>
                </select>

                <select
                    className ="search-bar"
                    value={position}
                    onChange={(e) => setPosition(e.target.value)}
                >
                    <option value="">Select position...</option>
                    <option value="PG">Point Guard</option>
                    <option value="SG">Shooting Guard</option>
                    <option value="SF">Small Forward</option>
                    <option value="PF">Power Forward</option>
                    <option value="C">Center</option>
                </select>
            </div>
            <div className="players-grid">
                {players.length === 0 ? (
                    <p>No players found.</p>
                ) : (
                    players.map((player) => (
                        <PlayerCard key={player.rank} player={player} />
                    ))
                )}
            </div>
        </div>
    );
};

export default Home;