import { useState } from "react";
import Modal from "./Modal";
import type {Player} from "../types/Player";
import "./PlayerCard.css";


const PlayerCard = ({ player }: { player: Player }) => {
    const [isModalOpen, setIsModalOpen] = useState(false);

    return (
        <>
            <div className="player-card" onClick={() => setIsModalOpen(true)} style={{ cursor: "pointer" }}>
                <h2>{player.name}</h2>
                <div className="player-info">
                    <div><strong>Team:</strong> {player.team}</div>
                    <div><strong>Position:</strong> {player.position}</div>
                    <div><strong>Age:</strong> {player.age}</div>
                </div>
                <div className="stats-grid">
                    <div className="stat">Points per game: {(player.points / player.games_played).toFixed(1)}</div>
                    <div className="stat">Average Assists: {(player.assists / player.games_played).toFixed(1)}</div>
                    <div className="stat">Average Rebounds: {(player.t_rebound / player.games_played).toFixed(1)}</div>
                    <div className="stat">Average Steals: {(player.steals / player.games_played).toFixed(1)}</div>
                </div>
            </div>

            <Modal isOpen={isModalOpen} onClose={() => setIsModalOpen(false)}>
                <h2>{player.name} - Detailed Stats</h2>
                <p><strong>Team:</strong> {player.team}</p>
                <p><strong>Age:</strong> {player.age}</p>
                <p><strong>Position:</strong> {player.position}</p>
                <p><strong>Games Played:</strong> {player.games_played}</p>
                <p><strong>Points:</strong> {player.points}</p>
                <p><strong>Assists:</strong> {player.assists}</p>
                <p><strong>Total Rebounds:</strong> {player.t_rebound}</p>
                <p><strong>Steals:</strong> {player.steals}</p>
                <p><strong>Blocks:</strong> {player.blocks}</p>
                <p><strong>Field Goal:</strong> {(player.field_goal_percent * 100).toFixed(1)}%</p>
                <p><strong>Three Point:</strong> {(player.three_point_percent * 100).toFixed(1)}%</p>
                <p><strong>Free Throw:</strong> {(player.free_throw_percent * 100).toFixed(1)}%</p>
            </Modal>
        </>

    );
};

export default PlayerCard;