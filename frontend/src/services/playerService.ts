export const fetchPlayers = async (
    team?: string,
    name?: string,
    position?: string
) => {
    const params = new URLSearchParams();
    if (team) params.append('team', team);
    if (name) params.append('name', name);
    if (position) params.append('position', position);

    const url = `http://localhost:8080/api/v1/player?${params.toString()}`;
    const res = await fetch(url);
    return res.json();
};