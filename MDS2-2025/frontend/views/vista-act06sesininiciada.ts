import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/button/src/vaadin-button.js';

@customElement('vista-act06sesininiciada')
export class VistaAct06sesininiciada extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout id="vaadinVerticalLayout7" style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout class="content" style="width: 100%; height: 100%;" id="vaadinHorizontalLayout1">
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout2" style="width: 100%; height: 100%;">
   <vaadin-horizontal-layout theme="spacing" id="arriba" style="width: 100%; height: 10%;">
    <vaadin-button id="perfil" style="align-self: center; margin: var(--lumo-space-xs); width: 10%;" tabindex="0">
      Tu perfil 
    </vaadin-button>
    <vaadin-button id="cerrarSesion" style="align-self: center; width: 13%;" tabindex="0">
      Cerrar Sesion 
    </vaadin-button>
    <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout1" style="width: 17%;"></vaadin-vertical-layout>
    <vaadin-button id="Imagen" style="width: 10%; height: 100%;" tabindex="0">
      Imagen 
    </vaadin-button>
    <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout" style="width: 25%;"></vaadin-vertical-layout>
    <vaadin-button id="Notificacion" style="align-self: center; margin: var(--lumo-space-xs); width: 15%;" tabindex="0">
      Notificaciones 
    </vaadin-button>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="height: 100%; width: 100%;">
    <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout6" style="width: 80%; padding-right: var(--lumo-space-s); padding-left: var(--lumo-space-s);">
     <vaadin-vertical-layout theme="spacing" id="usuarios" style="width: 100%; height: 100%;"></vaadin-vertical-layout>
     <vaadin-button id="masUsuarios" style="align-self: center;" tabindex="0">
       Más usuarios 
     </vaadin-button>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout5" style="width: 100%;">
     <vaadin-vertical-layout id="vaadinVerticalLayout4" style="align-self: center; height: 3%;">
       Recomendado para tí 
     </vaadin-vertical-layout>
     <vaadin-vertical-layout theme="spacing" id="tweets" style="width: 100%; height: 100%;"></vaadin-vertical-layout>
     <vaadin-button id="masTweets" style="align-self: center;" tabindex="0">
       Mostrar más 
     </vaadin-button>
    </vaadin-vertical-layout>
    <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout3" style="width: 80%; padding-right: var(--lumo-space-s); padding-left: var(--lumo-space-s);">
     <vaadin-vertical-layout theme="spacing" id="hashtags" style="width: 100%; height: 100%;"></vaadin-vertical-layout>
     <vaadin-button id="masHashtags" style="align-self: center;" tabindex="0">
       Más hashtags 
     </vaadin-button>
    </vaadin-vertical-layout>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout2" style="width: 100%; align-self: center; align-items: center; justify-content: center;">
    <vaadin-button id="escribir" style="align-self: center; flex-grow: 0; flex-shrink: 0; width: 20%; margin: var(--lumo-space-m); margin-right: var(--lumo-space-m); margin-top: var(--lumo-space-xs);" tabindex="0">
      Escribir 
    </vaadin-button>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
