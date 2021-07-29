export default function Animal({ id,  name}){
    return(
        <>
            <div style={{backgroudColor:'#red'}}>
                <h3><i>{id}.</i> <b>{name}</b></h3>                
            </div>
        </>
    )
}